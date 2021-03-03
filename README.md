# spring5_study
## IOC
## AOP
### 连接点
#### 可以被增强的方法
### 切入点
#### 实际被增强的方法
### 通知（增强）
#### 实际增强的逻辑部分
#### 通知有多种类型
##### 前置通知  （方法前执行）
##### 后置通知  （方法后执行）
##### 环绕通知  （方法前后都执行）
##### 异常通知  （异常执行）
##### 最终通知  （finally）
### 切面
#### 把通知应用到切入点的过程
### 使用AspectJ实现AOP，不属于Spring框架
#### 基于XML文件实现
#### 基于注解实现
#### 切入点表达式
##### execution([权限修饰符][返回类型][类全路径][方法名称][参数列表])
