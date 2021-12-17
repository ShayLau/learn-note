# arthas-example



![image.png](https://cdn.nlark.com/yuque/0/2021/png/236129/1617940404003-687b4938-5d45-41d7-8776-0fa200d0a575.png?x-oss-process=image%2Fresize%2Cw_1500)



![image.png](https://cdn.nlark.com/yuque/0/2021/png/236129/1617940452458-a6158cee-4bb1-4d5d-a8bc-5f174fb80a21.png?x-oss-process=image%2Fresize%2Cw_1500)



## Arthas主要解决的问题



**以下来自官网的说明**

Arthas 是Alibaba开源的Java诊断工具，深受开发者喜爱。当你遇到以下类似问题而束手无策时，Arthas可以帮助你解决：

- 这个类从哪个 jar 包加载的？为什么会报各种类相关的 Exception
- 我改的代码为什么没有执行到？难道是我没 commit？分支搞错了？
- 遇到问题无法在线上 debug，难道只能通过加日志再重新发布吗？
- 线上遇到某个用户的数据处理有问题，但线上同样无法 debug，线下无法重现！
- 是否有一个全局视角来查看系统的运行状况
- 有什么办法可以监控到JVM的实时运行状态？
- 怎么快速定位应用的热点，生成火焰图？
- Arthas支持JDK 6+，支持Linux/Mac/Windows，采用命令行交互模式，同时提供丰富的 Tab 自动补全功能，进一步方便进行问题的定位和诊断。



## 启动 Arthas

官网中启动 Arthas 通过两种方式启动 Arthas，一种是使用 Jar 包启动，一种是执行 sh 脚本的方式，考虑到环境和操作的方便，例子中以启动 jar 包的方式来运行 Arthas。



### 下载 Arthas

- [Arthas-boot.jar（增量）](https://github.com/alibaba/arthas/releases)： 启动Arthas-boot会执行相关脚本，外网下载增量 jar（内网使用不方便）
- [Arthas-Packaging （全量）](https://arthas.aliyun.com/download/latest_version?mirror=aliyun)：参考[全量启动 ArtHas说明](dingtalk://dingtalkclient/page/link?url=https%3A%2F%2Fh5.dingtalk.com%2Fcircle%2FpostDetail.html%3Ftype%3D7%26postId%3D8519879463%26token%3Df6ae8a7f0c7f34e92b0a7eb22156edcd&pc_slide=true)（方便内网使用）



### 启动要监控的程序

将[本项目](https://github.com/ShayLau/arthas-example)编译后生成 jar 文件，然后启动

```
#compile 和 package 省略
......

#启动Java 程序（SpringBoot Web 程序，放在文档附件, 注意 port=8080）
java -jar arthas-example-1.0-SNAPSHOT.jar
```

### ![image.png](https://cdn.nlark.com/yuque/0/2021/png/236129/1618471346373-aa1ea78b-d866-4d1a-83ca-d8fee4c13b67.png?x-oss-process=image%2Fresize%2Cw_1500)启动Arthas监控

启动 Arthas，选择启动的程序

```
#启动 arthas,以 Arthas-boot.jar 方式启动
java -jar arthas-boot.jar
#选择相应程序进程编号，图例中的进程PID 23937为刚刚启动的程序序号=1，接着输入序号 1
#启动成功相关说明.....
#键盘 Tad 可显示 Arthas 中的命令
```

![image.png](https://cdn.nlark.com/yuque/0/2021/png/236129/1618370299407-fb52f44b-607f-4c75-97bc-d2e9c3519e50.png?x-oss-process=image%2Fresize%2Cw_1500)

## 通过实际问题操作使用 ArtHas

以前我们通常会在源代码中添加Log日志，或者在本地环境进行代码断点调试，然后确认没有问题再更新到生产环。Arthas则可以观察程序的运行情况，如变量值、方法调用、查看程序 JVM 情况、Thread 情况排查问题，项目实例文章通过提出几个实际项目中可能会遇到的问题，通过Arthas命令尝试解决该问题。

Arthas 使用命令行的方式解决问题，在其他优秀的项目中，如：前端的Vue CLI（Command Line Interface）脚手架能够快速创建一个 Demo 项目，RocketMQ通过命令行快速启动服务，ArtHas 中的命令参考官网。



## 命令操作文章

[Arthas 的使用说明](https://www.yuque.com/sourlemon/java/mt38eg)

[Arthas实操系列 一：使用 Arthas 而非Log日志排查问题](https://www.yuque.com/sourlemon/java/dahszf)





## 引用

- [Arthas官网](https://arthas.aliyun.com/zh-cn/)
- [Arthas GitHub 主页](https://github.com/alibaba/arthas)
- [Arthas  Doc 文档](https://arthas.aliyun.com/doc/)
- **[项目中使用的代码](https://github.com/ShayLau/arthas-example)**

