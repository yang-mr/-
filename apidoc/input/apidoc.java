/**
 * @apiDefine CentraServerGroup Centra-Server
 *
 * 中心服务器 包括用户登录 注册 等
 */

/**
 * @apiDefine UserParam
 * @apiParam {Number} osType User os type.
 * @apiParam {String} AppId .
 * @apiParam {String} userId Users unique ID.
 * @apiParam {Number} TimeStamp time stamp.
 * @apiParam {String} cmdName .
 * @apiParam {String} deviceId .
 * @apiParam {Number} reqType .
 * @apiParam {String} sign .
 * @apiParam {String} password User password.
 */

/**
 * @api {post} /user/signin User sign in
 * @apiName signIn
 * @apiGroup CentraServerGroup
 * @apiUse UserParam

 * @apiParamExample {json} Request-Example:
        {
           "osType": 0,
           "password": "99",
           "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
           "TimeStamp": 1514954405076,
           "cmdName": "login",
           "deviceId": "54c9df6653ce",
           "reqType": 4,
           "sign": "a24ab1b7bdc8bbfcd59ebe58d3cf113d",
           "userId": "99@qq.com"
        }

 * @apiSuccess {String} firstname Firstname of the User.
 * @apiSuccess {String} lastname  Lastname of the User.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
 *     {
 *       "firstname": "John",
 *       "lastname": "Doe"
 *     }
 *
 * @apiErrorExample Error-Response:
       {
           "info": {
             "message": "Something went wrong with your Signin"
           },
           "code": 0
       }
 */

/**
 * @api {post} /user/signup User sign up
 * @apiName signUp
 * @apiGroup CentraServerGroup
 *
 * @apiParam {String} firstName User optional.
 * @apiParam {String} lastName User optional.
 * @apiParam {String} cellPhone User optional.
 * @apiParam {String} lastName User optional.
 * @apiParam {String} lastName User optional.
 * @apiUse UserParam
 *
 * @apiParamExample {json} Request-Example:
    {
       "cellPhone": "",
       "firstName": "",
       "lastName": "",
       "password": "66",
       "username": "66",
       "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
       "TimeStamp": 1514955556940,
       "cmdName": "register",
       "deviceId": "54c9df6653ce",
       "reqType": 4,
       "sign": "f0d0e1501b37b901e30fa7ecfc07ad6a",
       "userId": "66@qq.com"
     }
 *    
 * @apiSuccess {String} accessId Users unique.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
     {
       "user": {
         "verified": false,
         "accessId": "$2a$08$eQValOjCAQ2NNOEIHK\/SkuVbtA0JzKQFvXoVVr7Jsh4lizeQYIatS",
         "userId": "66@qq.com",
         "password": "$2a$08$dpo4OI42liP6xdXpJbc3FeGU\/TbgPPFhwuPoBBZiy8XB30OHNgkLe",
         "accountType": 1,
         "updatedAt": "2018-01-03T04:59:12.698Z",
         "createdAt": "2018-01-03T04:59:12.698Z"
       },
       "code": 1
     }
 * @apiError message error message.
 *
 * @apiErrorExample Error-Response:
       {
           "info": {
             "message": "Something went wrong with your Signin"
           },
           "code": 0
       }
 */


/**
 * @apiDefine DeviceFromBServerGroup DeviceFromB-Server 
 *
 * B-Server deviceInfo etc 
 */

/**
 * @apiDefine ParamFromBServer
 * @apiParam {String} AppId .
 * @apiParam {Number} TimeStamp time stamp.
 * @apiParam {String} accessId sign in or sign back.
 * @apiParam {String} cmdName .
 * @apiParam {String} deviceId .
 * @apiParam {Number} reqType .
 * @apiParam {String} sign .
 * @apiParam {String} userId .
 */

/**
 * @api {post} /createOperateCode.json Create operate code 
 * @apiName createOperateCode 
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {String} operateCode 让用户输入6位数字

 * @apiParamExample {json} Request-Example:
    {
       "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
       "TimeStamp": 1514957926305,
       "accessId": "yiliangaccess",
       "cmdName": "createOperateCode",
       "data": {
         "operateCode": "888555"
       },
       "deviceId": "54c9df6653ce",
       "reqType": 4,
       "sign": "963330dff95eabee42ee260459e0168c",
       "userId": "MYUNIONID"
    }

 * @apiSuccess {String} info Hint info.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "userId": "MYUNIONID",
       "accessId": "yiliangaccess",
       "deviceId": "54c9df6653ce",
       "cmdName": "createOperateCode",
       "reqType": 4,
       "code": 1,
       "info": "成功"
    }
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "createOperateCode",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /changeOperateCode.json Change operate code 
 * @apiName changeOperateCode
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {String} newOperateCode 让用户输入new 6位数字
 * @apiParam {String} oldOperateCode old 6位数字

 * @apiParamExample {json} Request-Example:
    {
      "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
      "TimeStamp": 1514958301886,
      "accessId": "yiliangaccess",
      "cmdName": "changeOperateCode",
      "data": {
        "newOperateCode": "111111",
        "oldOperateCode": "888555"
      },
      "deviceId": "54c9df6653ce",
      "reqType": 4,
      "sign": "a6bdc2cec593c3aab88cb852aa78cd37",
      "userId": "MYUNIONID"
    }

 * @apiSuccess {String} info Hint info.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "userId": "MYUNIONID",
       "accessId": "yiliangaccess",
       "deviceId": "54c9df6653ce",
       "cmdName": "changeOperateCode",
       "reqType": 4,
       "code": 1,
       "info": "成功"
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "changeOperateCode",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /getUserList.json Get users from device 
 * @apiName getUserList
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {Boolean} isIncludeUser . 
 * @apiParam {Number} pageNo . 

 * @apiParamExample {json} Request-Example:
    {
       "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
       "TimeStamp": 1514959261606,
       "accessId": "",
       "cmdName": "getUserList",
       "data": {
         "isIncludeUser": false,
         "pageNo": 0
       },
       "deviceId": "54c9df6653ce",
       "reqType": 4,
       "sign": "c9414d716a6da46809c110daffb1ddd5",
       "userId": "MYUNIONID"
    }

 * @apiSuccess {Number} isowner 1: isOwner 0: 普通用户.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "userId": "MYUNIONID",
       "accessId": "yiliangaccess",
       "deviceId": "54c9df6653ce",
       "cmdName": "getUserList",
       "reqType": 4,
       "code": 1,
       "info": "成功",
       "data": {
         "userNum": 1,
         "userList": [
           {
             "accessId": "yiliangaccess",
             "userName": "",
             "avatar": "",
             "isowner": 1,
             "fileNum": 2
           }
         ],
         "totalPages": 1,
         "pageNo": 0
       }
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "getUserList",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /getDeviceInfo.json Get deviceInfo from device 
 * @apiName getDeviceInfo
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer

 * @apiParamExample {json} Request-Example:
    {
      "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
      "TimeStamp": 1514959261597,
      "accessId": "",
      "cmdName": "getDeviceInfo",
      "data": {},
      "deviceId": "54c9df6653ce",
      "reqType": 4,
      "sign": "57dbdee8e8d555e14e216daacbd895d2",
      "userId": "MYUNIONID"
    }

 * @apiSuccess {Number} appCode .
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "code": 1,
       "info": "成功",
       "data": {
         "userdCapacity": "163.28MB",
         "freeCapacity": "8.44GB",
         "capacity": "9.95GB",
         "ownerName": "",
         "ownerImg": "",
         "ownerAccessId": "yiliangaccess",
         "appCode": 1,
         "deviceSn": "CBMOCHA0102BBHUIJDEPF",
         "appVersion": "1.0",
         "mac": "02:00:00:00:00:00",
         "atoCode": 100000,
         "percent": "1.60%",
         "hasOperateCode": false
       },
       "deviceId": "54c9df6651d2",
       "cmdName": "getDeviceInfo"
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "getDeviceInfo",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /unBind.json unBind user 
 * @apiName unBind 
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {String} delAccessId 被删除用户的accessId 
 * @apiParam {String} operateCode 6位数字

 * @apiParamExample {json} Request-Example:
    {
      "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
      "TimeStamp": 1514958301886,
      "accessId": "yiliangaccess",
      "cmdName": "unBind",
      "data": {
        "delAccessId": "111111",
        "operateCode": "888555"
      },
      "deviceId": "54c9df6653ce",
      "reqType": 4,
      "sign": "a6bdc2cec593c3aab88cb852aa78cd37",
      "userId": "MYUNIONID"
    }

 * @apiSuccess {String} info Hint info.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "userId": "MYUNIONID",
       "accessId": "yiliangaccess",
       "deviceId": "54c9df6653ce",
       "cmdName": "unBind",
       "reqType": 4,
       "code": 1,
       "info": "成功"
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "unBind",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /changeDeviceOwner.json changeDeviceOwner 
 * @apiName changeDeviceOwner 
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {String} changer 被删除用户的accessId 
 * @apiParam {String} operateCode 6位数字

 * @apiParamExample {json} Request-Example:
    {
      "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
      "TimeStamp": 1514958301886,
      "accessId": "yiliangaccess",
      "cmdName": "changeOperateCode",
      "data": {
        "changer": "111111",
        "operateCode": "888555"
      },
      "deviceId": "54c9df6653ce",
      "reqType": 4,
      "sign": "a6bdc2cec593c3aab88cb852aa78cd37",
      "userId": "MYUNIONID"
    }

 * @apiSuccess {String} info Hint info.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "userId": "MYUNIONID",
       "accessId": "yiliangaccess",
       "deviceId": "54c9df6653ce",
       "cmdName": "changeOperateCode",
       "reqType": 4,
       "code": 1,
       "info": "成功"
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "changeOperateCode",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /mergeLabel.json mergeLabel 
 * @apiName mergeLabel
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {Array} labelIds 被合并的LabelId在后 
 *
 * @apiParamExample {json} Request-Example:
    {
       "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
       "TimeStamp": 1514960955158,
       "accessId": "yiliangaccess",
       "cmdName": "mergeLabel",
       "data": {
         "labelIds": [
           25,
           2
         ]
       },
       "deviceId": "54c9df6653ce",
       "reqType": 4,
       "sign": "b3abbb670ecd7766668cf4bd6b5d9b15",
       "userId": "MYUNIONID"
    }

 * @apiSuccess {String} info Hint info.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
      "userId": "MYUNIONID",
      "accessId": "yiliangaccess",
      "deviceId": "54c9df6653ce",
      "cmdName": "mergeLabel",
      "reqType": 4,
      "code": 1,
      "info": "成功",
      "Status": {
        "Status": "Successful"
      }
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "mergeLabel",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /updateLabel.json updateLabel 
 * @apiName updateLabel
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {labelId} labelId label的id 
 * @apiParam {String} newName 通讯录里面的人 
 *
 * @apiParamExample {json} Request-Example:
    {
       "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
       "TimeStamp": 1514961536579,
       "accessId": "yiliangaccess",
       "cmdName": "updateLabel",
       "data": {
         "labelId": 6,
         "newName": "李易峰",
         "photoId": 0
       },
       "deviceId": "54c9df6653ce",
       "reqType": 4,
       "sign": "c2472822d8296a3b3457ee2b37b323e7",
       "userId": "MYUNIONID"
    }

 * @apiSuccess {String} info Hint info.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "userId": "MYUNIONID",
       "accessId": "yiliangaccess",
       "deviceId": "54c9df6653ce",
       "cmdName": "updateLabel",
       "reqType": 4,
       "code": 1,
       "info": "成功"
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "updateLabel",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */

/**
 * @api {post} /createLabel.json createLabel 
 * @apiName createLabel
 * @apiGroup DeviceFromBServerGroup
 * @apiUse ParamFromBServer
 * @apiParam {labelId} labelId label的id 
 * @apiParam {String} name 通讯录里面的人 
 *
 * @apiParamExample {json} Request-Example:
    {
       "AppId": "60076467277E4B1DD42F21B4DB5BD5A7",
       "TimeStamp": 1514961536579,
       "accessId": "yiliangaccess",
       "cmdName": "createLabel",
       "data": {
         "labelId": 6,
         "name": "jack"
       },
       "deviceId": "54c9df6653ce",
       "reqType": 4,
       "sign": "c2472822d8296a3b3457ee2b37b323e7",
       "userId": "MYUNIONID"
    }

 * @apiSuccess {String} info Hint info.
 *
 * @apiSuccessExample Success-Response:
 *     HTTP/1.1 200 OK
    {
       "userId": "MYUNIONID",
       "accessId": "yiliangaccess",
       "deviceId": "54c9df6653ce",
       "cmdName": "createLabel",
       "reqType": 4,
       "code": 1,
       "info": "成功"
    }
 *
 * @apiError {String} info Hint info.
 * @apiError {Number} code Error code.
 *
 * @apiErrorExample Error-Response:
    {
       "userId": "MYUNIONID",
       "accessId": "",
       "deviceId": "54c9df6653ce",
       "cmdName": "createLabel",
       "reqType": 4,
       "code": 2001,
       "info": "无权限访问"
    }
 */
