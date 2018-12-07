package com.jsako.springboot.runner;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * @Date 2018/12/7
 * @Author LLJ
 * @Description
 */
@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {
    @Value("${zookeeper.address}")
    private String zookeeperAddress;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        //创建客户端
        CuratorFramework client= CuratorFrameworkFactory.newClient(zookeeperAddress,new RetryOneTime(1000));
        client.start();
        client.blockUntilConnected();
        //创建服务实例
        ServiceInstance<Object> serviceInstance = ServiceInstance.builder().name("provider").address("192.168.34.180").port(80).build();
        //创建服务器发现者
        ServiceDiscovery<Object> serviceDiscovery = ServiceDiscoveryBuilder.builder(Object.class).client(client).basePath("/soa").build();
        //注册服务
        serviceDiscovery.registerService(serviceInstance);
    }
}
