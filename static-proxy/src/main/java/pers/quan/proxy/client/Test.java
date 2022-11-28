package pers.quan.proxy.client;

import pers.quan.proxy.service.OrderServiceImpl;
import pers.quan.proxy.service.ProxyOrderService;

public class Test {

    public static void main(String[] args) {
        OrderServiceImpl orderService = new OrderServiceImpl();
        ProxyOrderService proxyOrderService = new ProxyOrderService(orderService);
        proxyOrderService.generate();
        proxyOrderService.modify();
        proxyOrderService.detail();
    }
}
