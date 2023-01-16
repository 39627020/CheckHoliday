# CheckHoliday

#### 介绍
根据每年国务院放假安排生成当年的放假日历，并可以查询一段时间内的工作日及节假日。

#### 软件架构
Springboot + JDBC


#### 安装教程

1.  创建mysql数据库point，导入sys_holiday.sql文件，创建表结构。
2.  下载代码，编译并运行。

#### 使用说明

1.  代码运行后，访问http://localhost:8080/create?year=2023可以直接创建2023年一整年日历
![输入图片说明](https://foruda.gitee.com/images/1673865569027329590/b9600855_609629.png "屏幕截图")

2.  访问http://localhost:8080/query?from=20230101&to=20231231,可以访问2023年所有日历
![输入图片说明](https://foruda.gitee.com/images/1673865600765894435/747a610e_609629.png "屏幕截图")

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
