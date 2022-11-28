package pers.quan.proxy.service;

public class ProxyOrderService implements OrderService{

    private OrderService orderService;

    public ProxyOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public ProxyOrderService() {

    }

    @Override
    public void generate() {
        long start = System.currentTimeMillis();
        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println("花费：" + (end-start) + "毫秒数");
    }

    @Override
    public void modify() {
        long start = System.currentTimeMillis();
        orderService.modify();
        long end = System.currentTimeMillis();
        System.out.println("花费：" + (end-start) + "毫秒数");
    }

    @Override
    public void detail() {
        long start = System.currentTimeMillis();
        orderService.detail();
        long end = System.currentTimeMillis();
        System.out.println("花费：" + (end-start) + "毫秒数");
    }
}
