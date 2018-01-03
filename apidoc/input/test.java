/**
 * @apiDefine CentraServerGroup Centra-Server
 *
 * 中心服务器 包括用户登录 注册 等
 */

/**
 * @apiDefine UserParam
 * @apiParam {Number} osType User os type.
 * @apiParam {String} AppId User password.
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

