###笔记

+ 数据库连接数是有限的，频繁调用 getConnection/closeConnection 会频繁创建数据库连接，
造成大量的系统开销，所以我们需要使用数据库连接池，如Apache DBCP。

+ 需要注意，main/java、main/resources、test/java、test/resources 这四个目录都是
classpath的根目录，当运行单元测试时，遵循“就近原则”，即优先从 test/java、test/resources
加载类或读取文件。