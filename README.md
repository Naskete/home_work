# 学生管理系统

#### 登录

请求URL

* http://121.199.32.101:8088/manage/login

请求方法

*  GET

##### 接口示例

> URL：[http://121.199.32.101:8088/manage/login?username=admin&password=admin123]

```
登录成功
```



#### 登出

请求URL

* http://121.199.32.101:8088/manage/user/logout

请求方法

*  GET

返回:

```
退出
```



#### 查看所有学生

请求URL

* http://121.199.32.101:8088/manage/user/findall

请求方法

* GET

返回示例

```
[
	{
		"id":190001
		"name":"小可"
		"tel":100100111101
		"wechatnum":"xiaoke10100010"
		"college":"工程学院"
		"mainpro":"工业工程"
		"clazz":"工程191班"
		"teacher":"何璐"
		"qq":101000001
	
	}
]
```



#### 通过学号查找学生

请求URL

* URL:[http://121.199.32.101:8088/manage/user/findbyid]

请求方式

* GET

参数

参数名：id 参数类型： Int

返回示例

> URL:[http://121.199.32.101:8088/manage/user/findbyid?id=190001]



```
[
	{
		"id":190001
		"name":"小可"
		"tel":100100111101
		"wechatnum":"xiaoke10100010"
		"college":"工程学院"
		"mainpro":"工业工程"
		"clazz":"工程191班"
		"teacher":"何璐"
		"qq":101000001
	
	}
]
```



#### 通过班级查找学生

请求URL

* URL:[http://121.199.32.101:8088/manage/user/findbyclass]

请求方式

* GET

参数

参数名：clazz 参数类型： String

返回示例

> URL:[http://121.199.32.101:8088/manage/user/findbyclass?clazz=工程191班]

```
[
	{
		"id":190001
		"name":"小可"
		"tel":100100111101
		"wechatnum":"xiaoke10100010"
		"college":"工程学院"
		"mainpro":"工业工程"
		"clazz":"工程191班"
		"teacher":"何璐"
		"qq":101000001
	
	}
]
```



#### 创建学生家庭成员信息

请求URL

* http://121.199.32.101:8088/manage/user/addfamilier

请求方式

* POST

参数

| 参数名     | 参数类型 | 说明          |
| ---------- | -------- | ------------- |
| id         | Int      | 学生学号      |
| name       | String   | 学生姓名      |
| ffamilier  | String   | 家庭成员1姓名 |
| ftel       | Long     | 联系电话      |
| fworkplace | String   | 工作单位      |
| frelative  | String   | 与学生关系    |
| sfamilier  | String   | 家庭成员2姓名 |
| stel       | Long     | 联系电话      |
| sworkplace | String   | 工作单位      |
| srelative  | String   | 与学生关系    |

返回示例

> URL:[http://121.199.32.101:8088/manage/user/addfamilier?id=190001&name=小可&ffamilier=可可&ftel=11001001011&fworkplace=kejie公司&frelative=父子&sfamilier=丽丽&stel=10010010011&fworkplace=学校&srelative=母子]



```
[
	{
		"id":190001,
		"name":"小可",
		"ffamilier":"可可",
		"ftel":11001001011,
		"fworkplace":"kejie公司",
		"frelative":"父子",
		"sfamilier":"丽丽",
		"stel":10010010011,
		"sworkplace":"学校",
		"srelative":"母子"
	}
]
```





#### 学生查找家庭成员信息

请求URL

* URL:[http://121.199.32.101:8088/manage/user/findfamilier]

请求方式

* GET

参数

参数名：name 参数类型： String

> URL:[http://121.199.32.101:8088/manage/user/findfamilier?name=小可]



```
[
	{
		"id":190001,
		"name":"小可",
		"ffamilier":"可",
		"ftel":11001001011,
		"fworkplace":"kejie公司",
		"frelative":"父子",
		"sfamilier":"丽丽",
		"stel":10010010011,
		"sworkplace":"学校",
		"srelative":"母子"
		}
]
```





#### 辅导员查看自己信息

请求URL

* http://121.199.32.101:8088/manage/user/findme

请求方法

* GET

参数

参数名: name 参数类型：String

返回示例

> URL:[http://121.199.32.101:8088/manage/user/findme?name=何璐]



```
{
	"id":10001,
	"name":"何璐",
	"tel":10010001011,
	"qq":1110110110,
	"wechatnum":"helu10011011",
	"clazz":"工程191班"
}
```



#### 辅导员修改学生信息

请求URL

* http://121.199.32.101:8088/manage/user/modify/{id}

请求方法

* PUT

参数

| 参数名    | 参数类型 | 说明     |
| --------- | -------- | -------- |
| id        | Int      | 学生学号 |
| name      | String   | 学生姓名 |
| tel       | Long     | 电话号码 |
| qq        | Int      | QQ       |
| wechatnum | String   | 微信     |

返回示例

> URL:[http://121.199.32.101:8088/manage/user/modify/id=190001?name=可乐&tel=10010011111&QQ=1001101110&wechatnum=kele10010001]



```
[
	{
		"id":190001
		"name":"可乐"
		"tel":10010011111
		"wechatnum":"kele10010001"
		"college":"工程学院"
		"mainpro":"工业工程"
		"clazz":"工程191班"
		"teacher":"何璐"
		"qq":1001101110
	
	}
]
```



#### 通过姓名查找学生

请求URL

* URL:[http://121.199.32.101:8088/manage/user/findbyname]

请求方式

* GET

参数

参数名：name 参数类型： String

返回示例

> URL:[http://121.199.32.101:8088/manage/user/findbyname?name=小可]



```
[
	{
		"id":190001
		"name":"小可"
		"tel":100100111101
		"wechatnum":"xiaoke10100010"
		"college":工程学院
		"mainpro":工业工程
		"clazz":工程191班
		"teacher":何璐
		"qq":101000001
	}
]
```



#### 添加学生

请求URL

* http://121.199.32.101:8088/manage/user/addstudent

请求方式

* POST

参数

| 参数名    | 参数类型 | 说明     |
| --------- | -------- | -------- |
| id        | Int      | 学生学号 |
| name      | String   | 学生姓名 |
| qq        | Int      | QQ号     |
| wechatnum | String   | 微信号   |
| tel       | Long     | 联系电话 |
| college   | String   | 学院     |
| mainpro   | String   | 专业     |
| clazz     | String   | 班级     |
| teacher   | String   | 辅导员   |



返回示例

> URL:[http://121.199.32.101:8088/manage/addstudent?id=190001&name=小可&qq=101000001&wechatnum=xiaoke10100010&tel=100100111101&college=工程学院&mainpro=工业工程&clazz=工程191班&teacher=何璐]

```
[
	{
		"id":190001
		"name":"小可"
		"tel":100100111101
		"wechatnum":"xiaoke10100010"
		"college":"工程学院"
		"mainpro":"工业工程"
		"clazz":"工程191班"
		"teacher":"何璐"
		"qq":101000001
	
	}
]
```



#### 管理员修改学生信息

请求URL

* http://121.199.32.101:8088/manage/user/modifystudent/{id}

请求方法

* PUT

参数

| 参数名  | 参数类型 | 说明     |
| ------- | -------- | -------- |
| id      | Int      | 学生学号 |
| college | String   | 学院     |
| mainpro | String   | 专业     |



返回示例

> URL:[http://121.199.32.101:8088/manage/usr/modifystudent/id=190001?college=信息学院&mainpro=信息分析]



```
[
	{
		"id":190001
		"name":"小可"
		"tel":100100111101
		"wechatnum":"xiaoke10100010"
		"college":"信息学院"
		"mainpro":"信息分析"
		"clazz":"工程191班"
		"teacher":"何璐"
		"qq":101000001
	
	}
]
```



#### 配置学生班级

请求URL

* http://121.199.32.101:8088/manage/user/setclass/{id}

请求方法

* PUT

参数

参数名：id 参数类型：Int

参数名: clazz 参数类型：String

返回示例

> URL:[http://121.199.32.101:8088/manage/user/setclass/190001?clazz=工程192班]



```
[
	{
		"id":190001
		"name":"小可"
		"tel":100100111101
		"wechatnum":"xiaoke10100010"
		"college":"工程学院"
		"mainpro":"工业工程"
		"clazz":"工程192班"
		"teacher":"赵州"
		"qq":101000001
	
	}
]
```



#### 删除学生

请求URL

* http://121.199.32.101:8088/manage/user/deletestudent

请求方法

* GET

参数

参数名 id 参数类型 Int

返回示例

> URL：http://121.199.32.101:8088/manage/user/deletestudent?id=190001



```
删除成功
```





#### 管理员查看辅导员信息

请求URL

* http://121.199.32.101:8088/manage/user/findteacher

请求方法

* GET

返回示例：

> URL:[http://121.199.32.101:8088/manage/user/findteacher]



```
[
	{
		"id":10001,
		"name":"何璐",
		"tel":10010001011,
		"qq":1110110110,
		"wechatnum":"helu10011011",
		"clazz":"工程191班"
	},
	{
		"id":10002,
		"name":"赵州",
		"tel":11010110011,
		"qq":170200000,
		"wechatnum":"zhaozhou10010011",
		"clazz":"工程192班"
	}
]
```



#### 添加辅导员

请求URL

* http://121.199.32.101:8088/manage/user/addteacher

请求方式

* POST

参数



| 参数名    | 参数类型 | 说明       |
| --------- | -------- | ---------- |
| id        | Int      | 辅导员编号 |
| name      | String   | 辅导员姓名 |
| qq        | Int      | QQ号       |
| wechatnum | String   | 微信号     |
| tel       | Long     | 联系电话   |
| clazz     | String   | 班级       |



返回示例

> URL:[http://121.199.32.101:8088/manage/addteacher?id=10001&name=何璐&qq=1110110110&wechatnum=helu10011011&tel=:10010001011&clazz=工程191班]

```
[
	{
		"id":10001,
		"name":"何璐",
		"tel":10010001011,
		"qq":1110110110,
		"wechatnum":"helu10011011",
		"clazz":"工程191班"
	}
]
```



#### 修改辅导员信息

请求URL

* http://121.199.32.101:8088/manage/user/modifyteacher/{id}

请求方法

* PUT

参数

| 参数名    | 参数类型 | 说明       |
| --------- | -------- | ---------- |
| id        | Int      | 辅导员编号 |
| qq        | Int      | QQ号       |
| wechatnum | String   | 微信号     |
| tel       | Long     | 联系电话   |



返回示例

> URL:[http://121.199.32.101:8088/manage/user/modifyteacher/id=10001?qq=1001100001&wechatnum=helu010101&tel=12312311101]



```
[
	{
		"id":10001,
		"name":"何璐",
		"tel":12312311101,
		"qq":1001100001,
		"wechatnum":"helu010101",
		"clazz":"工程191班"
	}
]
```



#### 删除辅导员

请求URL

* http://121.199.32.101:8088/manage/user/deleteteacher

请求方法

* GET

返回示例：

> URL:http://121.199.32.101:8088/manage/user/deleteacher?id=10001



```
删除成功
```



#### 配置辅导员班级

请求URL

* http://121.199.32.101:8088/manage/user/updateclass/{id}

请求方法

* PUT

返回示例：

> URL:[http://121.199.32.101:8088/manage/user/updateclass/id=10001?clazz=工程192班&teacher=何璐]



```
修改成功
```