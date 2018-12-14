# -*- coding:utf-8 -*-
# -*- created by: mo -*-
import time
import urllib.request
import urllib.parse
import json
import hashlib
import base64
from concurrent.futures import ThreadPoolExecutor
from tornado.concurrent import run_on_executor
import tornado.httpserver
import tornado.ioloop
import tornado.options
import tornado.web
import tornado.gen
import json
import traceback

def add(a,b):
    c = int(a) + int(b)
    return str(c)

#自然语言处理:https://doc.xfyun.cn/rest_api/%E8%87%AA%E7%84%B6%E8%AF%AD%E8%A8%80%E5%9F%BA%E7%A1%80%E5%A4%84%E7%90%86.html
def zryy(method,content):
    body = urllib.parse.urlencode({'text': content}).encode('utf-8')

    url = 'http://ltpapi.xfyun.cn/v1/'+method
    api_key = '309aa84c8aa6c1656b1684b0dd688af9'
    param = {"type": "dependent"}

    x_appid = '5bd0853a'
    x_param = base64.b64encode(json.dumps(param).replace(' ', '').encode('utf-8'))
    x_time = int(int(round(time.time() * 1000)) / 1000)
    x_checksum = hashlib.md5(api_key.encode('utf-8') + str(x_time).encode('utf-8') + x_param).hexdigest()
    x_header = {'X-Appid': x_appid,
                'X-CurTime': x_time,
                'X-Param': x_param,
                'X-CheckSum': x_checksum}
    req = urllib.request.Request(url, body, x_header)
    result = urllib.request.urlopen(req)
    result = result.read()
    return result.decode('utf-8')


class MainHandler(tornado.web.RequestHandler):
    executor = ThreadPoolExecutor(32)

    """ handler基类 """
    def set_default_headers(self):
        self.set_header("Access-Control-Allow-Origin", "*");
        self.set_header("Access-Control-Allow-Headers", "x-requested-with,access_token");#这里要填写上请求带过来的Access-Control-Allow-Headers参数，如access_token就是我请求带过来的参数
        self.set_header("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE"); #请求允许的方法
        self.set_header("Access-Control-Max-Age", "3600");#用来指定本次预检请求的有效期，单位为秒，，在此期间不用发出另一条预检请求。
        #定义一个响应OPTIONS 请求，不用作任务处理
    def options(self):
        pass


    @tornado.gen.coroutine
    def get(self):
        '''get接口'''
        htmlStr = '''
                    <!DOCTYPE HTML><html>
                    <meta charset="utf-8">
                    <head><title>Get page</title></head>
                    <body>
                    <form		action="/post"	method="post" >
                    method:<br>
                    <input type="text"      name ="method"     /><br>
                    content:<br>
                    <input type="text"      name ="content"     /><br>
                    
                    <input type="submit"	value="add"	/>
                    </form></body> </html>
                '''
        self.write(htmlStr)

    @tornado.web.asynchronous
    @tornado.gen.coroutine
    def post(self):
        '''post接口， 获取参数'''
        method = self.get_argument("method", None)
        content = self.get_argument("content", None)
        yield self.coreOperation(method, content)

    @run_on_executor
    def coreOperation(self, a, b):
        '''主函数'''
        try:
            if  a != '' and b != '':
                result = zryy(a, b)  #可调用其他接口
            else:
                result = json.dumps({'code': 211, 'result': 'wrong input a or b', })
            self.write(result)
        except Exception:
            print ('traceback.format_exc():\n%s' % traceback.format_exc())
            result = json.dumps({'code': 503,'result': str(a)+'+'+str(b)})
            self.write(result)


if __name__ == "__main__":
    tornado.options.parse_command_line()
    app = tornado.web.Application(handlers=[(r'/post', MainHandler)], autoreload=False, debug=False)
    http_server = tornado.httpserver.HTTPServer(app)
    http_server.listen(1000)
    tornado.ioloop.IOLoop.instance().start()