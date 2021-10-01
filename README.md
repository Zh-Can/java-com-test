# 两种逆向生成方式：

1. https://github.com/matthiasblaesing/COMTypelibraries

   pom配置：

   	<build>
   		<plugins>
   			<plugin>
   				<groupId>eu.doppel-helix.jna.tlbcodegenerator</groupId>
   				<artifactId>TlbCodeGenerator</artifactId>
   				<version>1.0.2</version>
   				<configuration>
   					<file>D:/BackUp/op/op-0.4.0/op_x86.dll</file>
   				</configuration>
   			</plugin>
   		</plugins>
   	</build>

   从项目文件夹运行执行 `mvn eu.doppel-helix.jna.tlbcodegenerator:TlbCodeGenerator:generate`生成代码

2. 先注册dll
   后执行，需要知道tlb.id,查看这个id可以用 ResourceHacker 查看

   `java -cp "jna.jar;jna-platform.jar" com.sun.jna.platform.win32.COM.tlb.TlbImp -tlb.id {66b9c175-82f2-45e9-af86-58ad5ded5adc} -tlb.major.version 1 -tlb.minor.version 0 -bind.mode dispId -output.dir outputdir`

