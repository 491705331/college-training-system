
## 数据库相关
### 导出数据库数据

```sql
-- 1. 进入mysql安装目录的bin目录下
-- 2. 打开cmd（在路径上输入cmd）
-- 3. 输入下列命令
mysqldump -u root -p zjut-training > database_dump.txt
-- zjut-training 为数据库名
```

## 模块介绍
```text
app模块：
    -- 负责与前端的交互。包含controller接口，项目配置文件

common模块：
    -- 定义公共内容，如通用注解、全局常量、枚举值、工具类、异常类等
   
framework模块：
    -- 框架模块，主要定义springmvc的内容，如切面、统一异常管理、参数解析、拦截器等等
    
security模块：
    -- 负责权限管理
    
system模块：
    -- 系统核心模块
```