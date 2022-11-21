package pers.quan.spring.bean;

public class VipService {

    private VipDao vipDao;

    public void save() {
        vipDao.save();
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }
}
