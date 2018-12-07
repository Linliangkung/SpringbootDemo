package com.jsako.springboot;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Date 2018/12/7
 * @Author LLJ
 * @Description
 */
public class App {
    public static void main(String[] args) throws Exception {
        CuratorFramework client= CuratorFrameworkFactory.newClient("192.168.163.128:2181", new RetryOneTime(1000));
        client.start();
        client.blockUntilConnected();

        ServiceDiscovery<Object> discovery = ServiceDiscoveryBuilder.builder(Object.class).client(client).basePath("/soa").build();
        Collection<ServiceInstance<Object>> providers = discovery.queryForInstances("provider");
        List<String> collect = providers.stream().map(ServiceInstance::getAddress).collect(Collectors.toList());
        System.out.println(collect);
    }
}
