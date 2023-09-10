### git的使用



![](C:\Users\wpp\AppData\Roaming\Typora\typora-user-images\image-20230910105045581.png)

![image-20230910105147870](C:\Users\wpp\AppData\Roaming\Typora\typora-user-images\image-20230910105147870.png)

#### 1、git init：在当前目录建立一个本地仓库（工作区）。

2、git status：查询当前状态

3、添加文件到缓存区

4、git commit -m ‘first commit’（从缓存区提交到本地仓库，m后面跟的是注释，也可以说是日志，-m不可或缺）

5、git commit -am ‘’full commit‘’（从工作区提交到本地仓库）windows下用双引号，linux下用单引号

6、字面解释的话，git commit -m用于提交暂存区的文件，git commit -am用于提交跟踪过的文件

​      [注意]git commit -am可以写成git commit -a -m，但不能写成git commit -m -a

