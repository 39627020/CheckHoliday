# CheckHoliday

#### 介绍
根据每年国家放假安排生成当年的放假日历，并可以查询一段时间内的工作日及节假日。

#### 软件架构
Springboot + JPA + Swagger


#### 安装教程

1.  创建mysql数据库point。
2.  下载代码，编译并运行，系统会自动创建表结构。

#### 使用说明

## 1. 创建日历数据
### 1.1 根据国务院放假规定，准备假日，换休数据 HolidayServiceImpl.java文件
```
    public HolidayServiceImpl(){
        special = new ArrayList<>();
        special.add(new Holiday("2024-01-01","元旦",2,6));
        special.add(new Holiday("2024-01-02","元旦调休",3,7));
        special.add(new Holiday("2024-01-21","春节",2,6));
        special.add(new Holiday("2024-01-22","春节",2,7));
        special.add(new Holiday("2024-01-23","春节",2,1));
        special.add(new Holiday("2024-01-24","春节",2,2));
        special.add(new Holiday("2024-01-25","春节",2,3));
        special.add(new Holiday("2024-01-26","春节调休",2,4));
        special.add(new Holiday("2024-01-27","春节调休",2,5));
        special.add(new Holiday("2024-01-28","周六",0,6));
        special.add(new Holiday("2024-01-29","周日",0,7));
        special.add(new Holiday("2024-04-05","清明",2,3));
        special.add(new Holiday("2024-04-29","周六",0,6));
        special.add(new Holiday("2024-04-30","周日",0,7));
        special.add(new Holiday("2024-05-01","劳动节",2,7));
        special.add(new Holiday("2024-05-02","劳动节换休",2,7));
        special.add(new Holiday("2024-05-03","劳动节换休",2,7));
        special.add(new Holiday("2024-05-04","劳动节换休",2,7));
        special.add(new Holiday("2024-05-05","劳动节换休",2,7));
        special.add(new Holiday("2024-06-22","端午",2,4));
        special.add(new Holiday("2024-06-23","端午换休",3,5));
        special.add(new Holiday("2024-09-29","中秋",0,5));
        special.add(new Holiday("2024-10-01","国庆",2,7));
        special.add(new Holiday("2024-10-02","国庆",2,1));
        special.add(new Holiday("2024-10-03","国庆",2,2));
        special.add(new Holiday("2024-10-04","国庆换休",3,7));
        special.add(new Holiday("2024-10-05","国庆换休",3,7));
        special.add(new Holiday("2024-10-06","国庆换休",3,7));
        special.add(new Holiday("2024-10-07","周六",0,6));
        special.add(new Holiday("2024-10-08","周日",0,7));
    }
```
### 1.2 访问http://localhost:8080/holidays/create/2024，创建对象年的日历数据
### 1.3 访问http://localhost:8080/holidays/2024-01-01，获取某日日历数据
### 1.4 访问http://localhost:8080/holidays/interval?from=2024-01-01&to=2024-01-05，访问一段时间的日历数据。
### 1.5 访问http://localhost:8080/swagger-ui/index.html,查看所有接口数据 
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
