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
            "description": "<p>User password.</p>"
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
    "filename": "input/test.java",
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
            "description": "<p>User password.</p>"
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
    "filename": "input/test.java",
    "groupTitle": "Centra-Server",
    "groupDescription": "<p>中心服务器 包括用户登录 注册 等</p>"
  }
] });