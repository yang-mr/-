define({ "api": [
  {
    "type": "post",
    "url": "/user/signin",
    "title": "User sign in",
    "name": "signIn",
    "group": "CentraServerGroup",
    "parameter": {
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n   \"osType\": 0,\n   \"password\": \"99\",\n   \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n   \"TimeStamp\": 1514954405076,\n   \"cmdName\": \"login\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"reqType\": 4,\n   \"sign\": \"a24ab1b7bdc8bbfcd59ebe58d3cf113d\",\n   \"userId\": \"99@qq.com\"\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "osType",
            "description": "<p>User os type.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>Users unique ID.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>User password.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "firstname",
            "description": "<p>Firstname of the User.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "lastname",
            "description": "<p>Lastname of the User.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"firstname\": \"John\",\n  \"lastname\": \"Doe\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n    \"info\": {\n      \"message\": \"Something went wrong with your Signin\"\n    },\n    \"code\": 0\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "Centra-Server",
    "groupDescription": "<p>中心服务器 包括用户登录 注册 等</p>"
  },
  {
    "type": "post",
    "url": "/user/signup",
    "title": "User sign up",
    "name": "signUp",
    "group": "CentraServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "firstName",
            "description": "<p>User optional.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "lastName",
            "description": "<p>User optional.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cellPhone",
            "description": "<p>User optional.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "osType",
            "description": "<p>User os type.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>Users unique ID.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>User password.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n   \"cellPhone\": \"\",\n   \"firstName\": \"\",\n   \"lastName\": \"\",\n   \"password\": \"66\",\n   \"username\": \"66\",\n   \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n   \"TimeStamp\": 1514955556940,\n   \"cmdName\": \"register\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"reqType\": 4,\n   \"sign\": \"f0d0e1501b37b901e30fa7ecfc07ad6a\",\n   \"userId\": \"66@qq.com\"\n }",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>Users unique.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n {\n   \"user\": {\n     \"verified\": false,\n     \"accessId\": \"$2a$08$eQValOjCAQ2NNOEIHK\\/SkuVbtA0JzKQFvXoVVr7Jsh4lizeQYIatS\",\n     \"userId\": \"66@qq.com\",\n     \"password\": \"$2a$08$dpo4OI42liP6xdXpJbc3FeGU\\/TbgPPFhwuPoBBZiy8XB30OHNgkLe\",\n     \"accountType\": 1,\n     \"updatedAt\": \"2018-01-03T04:59:12.698Z\",\n     \"createdAt\": \"2018-01-03T04:59:12.698Z\"\n   },\n   \"code\": 1\n }",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "message",
            "description": "<p>error message.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n    \"info\": {\n      \"message\": \"Something went wrong with your Signin\"\n    },\n    \"code\": 0\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "Centra-Server",
    "groupDescription": "<p>中心服务器 包括用户登录 注册 等</p>"
  },
  {
    "type": "post",
    "url": "/changeDeviceOwner.json",
    "title": "changeDeviceOwner",
    "name": "changeDeviceOwner",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "changer",
            "description": "<p>被删除用户的accessId</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "operateCode",
            "description": "<p>6位数字</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n  \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n  \"TimeStamp\": 1514958301886,\n  \"accessId\": \"yiliangaccess\",\n  \"cmdName\": \"changeOperateCode\",\n  \"data\": {\n    \"changer\": \"111111\",\n    \"operateCode\": \"888555\"\n  },\n  \"deviceId\": \"54c9df6653ce\",\n  \"reqType\": 4,\n  \"sign\": \"a6bdc2cec593c3aab88cb852aa78cd37\",\n  \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"yiliangaccess\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"changeOperateCode\",\n   \"reqType\": 4,\n   \"code\": 1,\n   \"info\": \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"changeOperateCode\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/changeOperateCode.json",
    "title": "Change operate code",
    "name": "changeOperateCode",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "newOperateCode",
            "description": "<p>让用户输入new 6位数字</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "oldOperateCode",
            "description": "<p>old 6位数字</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n  \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n  \"TimeStamp\": 1514958301886,\n  \"accessId\": \"yiliangaccess\",\n  \"cmdName\": \"changeOperateCode\",\n  \"data\": {\n    \"newOperateCode\": \"111111\",\n    \"oldOperateCode\": \"888555\"\n  },\n  \"deviceId\": \"54c9df6653ce\",\n  \"reqType\": 4,\n  \"sign\": \"a6bdc2cec593c3aab88cb852aa78cd37\",\n  \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"yiliangaccess\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"changeOperateCode\",\n   \"reqType\": 4,\n   \"code\": 1,\n   \"info\": \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"changeOperateCode\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/createLabel.json",
    "title": "createLabel",
    "name": "createLabel",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "labelId",
            "optional": false,
            "field": "labelId",
            "description": "<p>label的id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>通讯录里面的人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n   \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n   \"TimeStamp\": 1514961536579,\n   \"accessId\": \"yiliangaccess\",\n   \"cmdName\": \"createLabel\",\n   \"data\": {\n     \"labelId\": 6,\n     \"name\": \"jack\"\n   },\n   \"deviceId\": \"54c9df6653ce\",\n   \"reqType\": 4,\n   \"sign\": \"c2472822d8296a3b3457ee2b37b323e7\",\n   \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"yiliangaccess\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"createLabel\",\n   \"reqType\": 4,\n   \"code\": 1,\n   \"info\": \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"createLabel\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/createOperateCode.json",
    "title": "Create operate code",
    "name": "createOperateCode",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "operateCode",
            "description": "<p>让用户输入6位数字</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n   \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n   \"TimeStamp\": 1514957926305,\n   \"accessId\": \"yiliangaccess\",\n   \"cmdName\": \"createOperateCode\",\n   \"data\": {\n     \"operateCode\": \"888555\"\n   },\n   \"deviceId\": \"54c9df6653ce\",\n   \"reqType\": 4,\n   \"sign\": \"963330dff95eabee42ee260459e0168c\",\n   \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"yiliangaccess\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"createOperateCode\",\n   \"reqType\": 4,\n   \"code\": 1,\n   \"info\": \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"createOperateCode\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/getDeviceInfo.json",
    "title": "Get deviceInfo from device",
    "name": "getDeviceInfo",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n  \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n  \"TimeStamp\": 1514959261597,\n  \"accessId\": \"\",\n  \"cmdName\": \"getDeviceInfo\",\n  \"data\": {},\n  \"deviceId\": \"54c9df6653ce\",\n  \"reqType\": 4,\n  \"sign\": \"57dbdee8e8d555e14e216daacbd895d2\",\n  \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "appCode",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"code\": 1,\n   \"info\": \"成功\",\n   \"data\": {\n     \"userdCapacity\": \"163.28MB\",\n     \"freeCapacity\": \"8.44GB\",\n     \"capacity\": \"9.95GB\",\n     \"ownerName\": \"\",\n     \"ownerImg\": \"\",\n     \"ownerAccessId\": \"yiliangaccess\",\n     \"appCode\": 1,\n     \"deviceSn\": \"CBMOCHA0102BBHUIJDEPF\",\n     \"appVersion\": \"1.0\",\n     \"mac\": \"02:00:00:00:00:00\",\n     \"atoCode\": 100000,\n     \"percent\": \"1.60%\",\n     \"hasOperateCode\": false\n   },\n   \"deviceId\": \"54c9df6651d2\",\n   \"cmdName\": \"getDeviceInfo\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"getDeviceInfo\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/getUserList.json",
    "title": "Get users from device",
    "name": "getUserList",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Boolean",
            "optional": false,
            "field": "isIncludeUser",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "pageNo",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n   \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n   \"TimeStamp\": 1514959261606,\n   \"accessId\": \"\",\n   \"cmdName\": \"getUserList\",\n   \"data\": {\n     \"isIncludeUser\": false,\n     \"pageNo\": 0\n   },\n   \"deviceId\": \"54c9df6653ce\",\n   \"reqType\": 4,\n   \"sign\": \"c9414d716a6da46809c110daffb1ddd5\",\n   \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "isowner",
            "description": "<p>1: isOwner 0: 普通用户.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"yiliangaccess\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"getUserList\",\n   \"reqType\": 4,\n   \"code\": 1,\n   \"info\": \"成功\",\n   \"data\": {\n     \"userNum\": 1,\n     \"userList\": [\n       {\n         \"accessId\": \"yiliangaccess\",\n         \"userName\": \"\",\n         \"avatar\": \"\",\n         \"isowner\": 1,\n         \"fileNum\": 2\n       }\n     ],\n     \"totalPages\": 1,\n     \"pageNo\": 0\n   }\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"getUserList\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/mergeLabel.json",
    "title": "mergeLabel",
    "name": "mergeLabel",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Array",
            "optional": false,
            "field": "labelIds",
            "description": "<p>被合并的LabelId在后</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n   \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n   \"TimeStamp\": 1514960955158,\n   \"accessId\": \"yiliangaccess\",\n   \"cmdName\": \"mergeLabel\",\n   \"data\": {\n     \"labelIds\": [\n       25,\n       2\n     ]\n   },\n   \"deviceId\": \"54c9df6653ce\",\n   \"reqType\": 4,\n   \"sign\": \"b3abbb670ecd7766668cf4bd6b5d9b15\",\n   \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"userId\": \"MYUNIONID\",\n  \"accessId\": \"yiliangaccess\",\n  \"deviceId\": \"54c9df6653ce\",\n  \"cmdName\": \"mergeLabel\",\n  \"reqType\": 4,\n  \"code\": 1,\n  \"info\": \"成功\",\n  \"Status\": {\n    \"Status\": \"Successful\"\n  }\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"mergeLabel\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/unBind.json",
    "title": "unBind user",
    "name": "unBind",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "delAccessId",
            "description": "<p>被删除用户的accessId</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "operateCode",
            "description": "<p>6位数字</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n  \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n  \"TimeStamp\": 1514958301886,\n  \"accessId\": \"yiliangaccess\",\n  \"cmdName\": \"unBind\",\n  \"data\": {\n    \"delAccessId\": \"111111\",\n    \"operateCode\": \"888555\"\n  },\n  \"deviceId\": \"54c9df6653ce\",\n  \"reqType\": 4,\n  \"sign\": \"a6bdc2cec593c3aab88cb852aa78cd37\",\n  \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"yiliangaccess\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"unBind\",\n   \"reqType\": 4,\n   \"code\": 1,\n   \"info\": \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"unBind\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  },
  {
    "type": "post",
    "url": "/updateLabel.json",
    "title": "updateLabel",
    "name": "updateLabel",
    "group": "DeviceFromBServerGroup",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "labelId",
            "optional": false,
            "field": "labelId",
            "description": "<p>label的id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "newName",
            "description": "<p>通讯录里面的人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "AppId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "TimeStamp",
            "description": "<p>time stamp.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "accessId",
            "description": "<p>sign in or sign back.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cmdName",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "deviceId",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reqType",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sign",
            "description": "<p>.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n   \"AppId\": \"60076467277E4B1DD42F21B4DB5BD5A7\",\n   \"TimeStamp\": 1514961536579,\n   \"accessId\": \"yiliangaccess\",\n   \"cmdName\": \"updateLabel\",\n   \"data\": {\n     \"labelId\": 6,\n     \"newName\": \"李易峰\",\n     \"photoId\": 0\n   },\n   \"deviceId\": \"54c9df6653ce\",\n   \"reqType\": 4,\n   \"sign\": \"c2472822d8296a3b3457ee2b37b323e7\",\n   \"userId\": \"MYUNIONID\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"yiliangaccess\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"updateLabel\",\n   \"reqType\": 4,\n   \"code\": 1,\n   \"info\": \"成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "type": "String",
            "optional": false,
            "field": "info",
            "description": "<p>Hint info.</p>"
          },
          {
            "group": "Error 4xx",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>Error code.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n   \"userId\": \"MYUNIONID\",\n   \"accessId\": \"\",\n   \"deviceId\": \"54c9df6653ce\",\n   \"cmdName\": \"updateLabel\",\n   \"reqType\": 4,\n   \"code\": 2001,\n   \"info\": \"无权限访问\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "input/apidoc.java",
    "groupTitle": "DeviceFromB-Server ",
    "groupDescription": "<p>B-Server deviceInfo etc</p>"
  }
] });
