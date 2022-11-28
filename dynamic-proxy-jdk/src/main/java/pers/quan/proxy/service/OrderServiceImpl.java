package pers.quan.proxy.service;

public class OrderServiceImpl implements OrderService{
    @Override
    public void generate() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单生成完成");
    }

    @Override
    public void modify() {
        try {
            Thread.sleep(1100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单修改完成");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(593);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单详情信息");
    }
}
