### it的使用



![](C:\Users\wpp\AppData\Roaming\Typora\typora-user-images\image-20230910105045581.png)

![image-20230910105147870](C:\Users\wpp\AppData\Roaming\Typora\typora-user-images\image-20230910105147870.png)

#### 1、git init：在当前目录建立一个本地仓库（工作区）。

2、git status：查询当前状态

3、git add：添加文件到缓存区

4、git commit -m ‘first commit’（从缓存区提交到本地仓库，m后面跟的是注释，也可以说是日志，-m不可或缺）

5、git commit -am ‘’full commit‘’（从工作区提交到本地仓库）windows下用双引号，linux下用单引号

6、字面解释的话，git commit -m用于提交暂存区的文件，git commit -am用于提交跟踪过的文件

​      [注意]git commit -am可以写成git commit -a -m，但不能写成git commit -m -a

7、git log ：查看历史提交版本的详细信息

![image-20230910111130858](C:\Users\wpp\AppData\Roaming\Typora\typora-user-images\image-20230910111130858.png)

8、

[参考链接1](https://blog.csdn.net/CYK_byte/article/details/128314996)

9、git remote add origin git@gitee.com:xxx/backup-data.git：添加远程仓库地址，在本地文件夹下运行命令：

（注意：将 `git@gitee.com:xxx/backup-data.git` 替换成刚刚自己复制的仓库地址，origin为远程仓库的名称：自己命名的，只是一个标记）

10、git remote -v：查看远程仓库信息

11、git push -u origin master：提交本地到远程仓库

参数说明：

`origin`：该参数为远程仓库的名称，如果刚刚添加了多个仓库，此时就可以通过更改名称将文件推送到指定仓库

`master`：推送的分支，本地有多个分支，默认为master

12、git remote rm  仓库名：现在想要解除与某个远程仓库的连接

13、git clone 仓库网址：克隆仓库到本地工作区