# 框架简介——快速了解

基于Spring Boot、Spring Cloud & Alibaba、OAuth2、Vue、Element-Ul的前后端分离微服务极速后台开发框架。

# 主要特性

- 完全响应式布局（支持电脑、平板、手机等所有主流设备）
- 强大的一键生成功能（包括控制器、模型、视图、菜单等）
- 支持多数据源，简单配置即可实现切换。
- 支持按钮及数据权限，可自定义部门数据权限。
- 对常用js插件进行二次封装，使js代码变得简洁，更加易维护
- 完善的XSS防范及脚本过滤，彻底杜绝XSS攻击
- Maven多项目依赖，模块及插件分项目，尽量松耦合，方便模块升级、增减模块。
- 国际化支持，服务端及客户端支持
- 完善的日志记录体系简单注解即可实现

# 技术选型
#### 1、系统环境

- Java EE 8
- Servlet 3.0
- Apache Maven 3

#### 2、主框架

- Spring Boot 2.2
- Spring Cloud Hoxton.SR3
- Spring Framework 5.1
- Spring Security 5.1

#### 3、持久层

- Apache MyBatis 3.4
- Hibernate Validation 6.0
- Alibaba Druid 1.1

#### 4、视图层

- Vue 2.6
- Axios 0.18
- Element UI 2.11

# 系统目录结构
## 系统模块

~~~
com.emersysrd     
├── emersysrd-vue-ui      // 前端框架 [80]
├── emersysrd-modules     // 平台业务模块
│       └── emersysrd-emerduty-api                    // 应急值守 [8201]
│       └── emersysrd-guarantee-api                   // 综合保障 [8202]
│       └── emersysrd-command-api                     // 应急指挥 [8203]
│       └── emersysrd-app-api                         // 应急app  [8204]
│
com.ruoyi  
├── ruoyi-gateway         // 系统网关模块 [8080]
├── ruoyi-auth            // 系统认证中心 [9200]
├── ruoyi-api             // 系统接口模块
│       └── ruoyi-api-system                          // 系统接口
├── ruoyi-common          // 系统通用模块
│       └── ruoyi-common-core                         // 核心模块
│       └── ruoyi-common-datascope                    // 权限范围
│       └── ruoyi-common-log                          // 日志记录
│       └── ruoyi-common-redis                        // 缓存服务
│       └── ruoyi-common-security                     // 安全模块
│       └── ruoyi-common-swagger                      // 系统接口
├── ruoyi-modules         // 系统业务模块
│       └── ruoyi-system                              // 系统模块 [9201]
│       └── ruoyi-gen                                 // 代码生成 [9202]
│       └── ruoyi-job                                 // 定时任务 [9203]
├── ruoyi-visual          // 系统图形化管理模块
│       └── ruoyi-visual-monitor                      // 监控中心 [9100]
├──pom.xml                // 公共依赖
~~~

## 系统-架构图

<img src="https://oscimg.oschina.net/oscnet/up-aaa2d885b0fba37e52b56f0948edde1c4fe.png"/>

## 系统-内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

# 核心技术

> 前端技术栈 ES6、vue、vuex、vue-router、vue-cli、axios、element-ui

> 后端技术栈 Spring Boot、Spring Cloud & Alibaba、OAuth2

# 后端技术
# SpringBoot框架

1、介绍

- Spring Boot是一款开箱即用框架，提供各种默认配置来简化项目配置。让我们的Spring应用变的更轻量化、更快的入门。 在主程序执行main函数就可以运行。你也可以打包你的应用为jar并通过使用java -jar来运行你的Web应用。它遵循"约定优先于配置"的原则， 使用SpringBoot只需很少的配置，大部分的时候直接使用默认的配置即可。可以与Spring Cloud的微服务无缝结合。
`Spring Boot2.0 环境要求必须是jdk8或以上版本，Tomcat8或以上版本`

2、优点

- 使编码变得简单： 推荐使用注解。
- 使配置变得简单： 自动配置、快速构建项目、快速集成新技术能力 没有冗余代码生成和XML配置的要求
- 使部署变得简单： 内嵌Tomcat、Jetty、Undertow等web容器，无需以war包形式部署
- 使监控变得简单： 自带项目监控

# SpringCloud框架

1、介绍

Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地简化了分布式系统基础设施的开发， 如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用Spring Boot的开发风格做到一键启动和部署。 Spring Cloud并没有重复制造轮子，它只是将目前各家公司开发的比较成熟、经得起实际考验的服务框架组合起来， 通过Spring Boot风格进行再封装屏蔽掉了复杂的配置和实现原理，最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工具包。

2、优点

- 把模块拆分，使用接口通信，降低模块之间的耦合度。
- 把项目拆分成若干个子项目，不同的团队负责不同的子项目。
- 增加功能时只需要再增加一个子项目，调用其他系统的接口就可以。
- 可以灵活的进行分布式部署。

# Spring Security安全控制

1、介绍

Spring Security是一个能够为基于Spring的企业应用系统提供声明式的安全访问控制解决方案的安全框架。

2、功能

- Authentication： 认证，就是用户登录
- Authorization： 授权，判断用户拥有什么权限，可以访问什么资源
- 安全防护，跨站脚本攻击，session攻击等
- 非常容易结合Spring进行使用

3、Spring Security 与 Shiro 的区别

相同点

- 1、认证功能
- 2、授权功能
- 3、加密功能
- 4、会话管理
- 5、缓存支持
- 6、rememberMe功能
- ....

不同点

优点：

- 1、Spring Security基于Spring开发，项目如果使用Spring作为基础，配合Spring Security做权限更加方便。而Shiro需要和Spring进行整合开发
- 2、Spring Security功能比Shiro更加丰富，例如安全防护方面
- 3、Spring Security社区资源相对比Shiro更加丰富

缺点：

- 1）Shiro的配置和使用比较简单，Spring Security上手复杂些
- 2）Shiro依赖性低，不需要依赖任何框架和容器，可以独立运行。Spring Security依赖Spring容器

# 前端技术

- npm：node.js的包管理工具，用于同一管理我们前端项目中需要用到的包、插件、工具、命令等，便于开发和维护。
- ES6：Javascript的新版本，ECMAScript6的简称。利用ES6我们可以简化我们的JS代码，同时利用其提供的强大功能来快速实现JS逻辑。
- vue-cli：Vue的脚手架工具，用于自动生成Vue项目的目录及文件。
- vue-router： Vue提供的前端路由工具，利用其我们实现页面的路由控制，局部刷新及按需加载，构建单页应用，实现前后端分离。
- vuex：Vue提供的状态管理工具，用于同一管理我们项目中各种数据的交互和重用，存储我们需要用到数据对象。
- element-ui：基于MVVM框架Vue开源出来的一套前端ui组件。
