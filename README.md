# Office Automation 办公自动化系统

## 项目简介

- 本项目是一个简单的办公自动化系统, 在未来会慢慢扩充. 
- 本项目采用 [SpringBoot](http://projects.spring.io/spring-boot/) 的 `1.5.2.RELEASE` 版本做基础架构支撑, 参考本项目建议有一定的 [SpringBoot](http://projects.spring.io/spring-boot/) 基础及经验.
- 项目中Bean全部采用 [lombok](https://projectlombok.org/) 进行简化, 需要配合IDE插件使用, 在此项目不进行讨论, 如需了解更多, 参考以下链接: 
  - 官方文档地址：<https://projectlombok.org/features/index.html>
  - 官方下载地址：<https://projectlombok.org/download.html>
- 目前在不定时进行调整和补充, 需要关注更新的请Watch、Star、Fork.
- 转发请保留原地址：<http://github.com/keveon/office-automation>

## 正式开始

#### 准备工作

>在开始提到, 本项目采用 `SpringBoot` 做基础架构支撑, 使用 `Maven` 做包管理, 详情请参阅使用 [Maven](https://spring.io/guides/gs/maven/) 构建的入门指南.

#### 项目结构

- [commons](commons): 用来放公共工具类的等.
- [model](model): 存放 `Entity` 实体, 即数据库数据模型.
  - [vo](model/src/main/java/com/keveon/oa/model/vo): 展示层对象.
  - [condition](model/src/main/java/com/keveon/oa/model/condition): 动态查询条件对象.
- [repository](repository): 数据持久层, 其下有三个package, 分别为:
- [service](service): 业务逻辑层.
- [web](web): 提供控制器及REST接口:
  - [rest](web/src/main/java/com/keveon/oa/rest): 直接对外提供 `RESTful` 接口.
  - [controller](web/src/main/java/com/keveon/oa/controller): 提供 `SpringMVC` 的 `Controllers`.

###### 注: 数据库连接、容器配置等都放在 `web` 层 [src/main/resources](web/src/main/resources) 目录下.

## 附录A：Github 常用按钮说明

- Watch：关注该项目, 作者有更新的时候, 会在你的 Github 主页有通知消息.
- Star：收藏该项目, 在你的头像上有一个 "Your stars" 链接, 可以看到你的收藏列表, 以方便下次进来.
- Fork：复制一份项目到自己的 Github 空间上, 你可以自己开发自己的这个地址项目, 然后 Pull Request 给项目原主人.

## 附录B：Spring Data JPA 常用功能讲解
> - [spring-data-jpa-demo](https://github.com/Keveon/spring-data-jpa-demo): 本项目是一个SpringDataJpa的demo项目, 旨在演示大部分常用的使用方法.

## 附录C：Spring Security 常用功能讲解
> - [spring-security-demo](https://github.com/Keveon/spring-security-demo): 本项目是一个SpringSecurity的demo项目, 旨在演示部分使用方法。

## 联系方式

- Github: <https://github.com/Keveon>
- OscGit: <https://git.oschina.net/keveon>
- Email：<Keveon@Keveon.com>
- QQ：   <a target="_blank" href="http://sighttp.qq.com/authd?IDKEY=545fca7ee732f622e810ce019d5a38bf6454649d43075ddf">
            <img border="0" src="http://wpa.qq.com/imgd?IDKEY=545fca7ee732f622e810ce019d5a38bf6454649d43075ddf&pic=51" alt="点击这里给我发消息" title="点击这里给我发消息"/>
         </a>
- QQ群：<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=4815a95af723fdbdf03a6f231cfca537bbbf0bec5d892d27657a8ed408466aff">
            <img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="一步一步学好java" title="一步一步学好java">
        </a>

## 结束语

- 真心感谢这些志同道合的人, 这个真的很重要, 也希望你能一起参与！
- 同时感谢那些通过私聊或其他方式指出一些错误地方的朋友, 使得该教程能得以更加完善, 真心感谢！