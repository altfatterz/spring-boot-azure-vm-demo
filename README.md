```bash
$ sdk install java 22.3.r17-nik 
```

[Liberica NIK](https://bell-sw.com/liberica-native-image-kit/) is a multilingual tool that transforms your applications into performant native images based on GraalVM Open Source.


Build:

```bash
$ mvn -Pnative native:compile
```

Execute
```bash
$ ./target/spring-boot-azure-vm-demo
...
Started SpringBootAzureVmDemoApplication in 0.078 seconds (process running for 0.09)
```