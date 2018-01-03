/**
 * @apiDefine CentraServerGroup Centra-Server
 *
 * 中心服务器 包括用户登录 注册 等
 */

/**
 * @apiDefine UserParam
 * @apiParam {String} userId Users unique ID.
 * @apiParam {String} password User password.
 */

/**
 * @api {post} /user/signin User sign in
 * @apiName signIn
 * @apiGroup CentraServerGroup
 * @apiUse UserParam

 * @apiParamExample {json} Request-Example:
 *     {
 *       "id": 4711
 *     }

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
 * @apiError UserNotFound The id of the User was not found.
 *
 * @apiErrorExample Error-Response:
 *     HTTP/1.1 404 Not Found
 *     {
 *       "error": "UserNotFound"
 *     }
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
 * @apiHeaderExample Success-Response:
 *     HTTP/1.1 200 OK
 *     {
 *       "firstname": "John",
 *       "lastname": "Doe"
 *     }

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
 * @apiError UserNotFound The id of the User was not found.
 *
 * @apiErrorExample Error-Response:
 *     HTTP/1.1 404 Not Found
 *     {
 *       "error": "UserNotFound"
 *     }
 */

