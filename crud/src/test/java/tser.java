import org.junit.Test;

import java.util.List;

public class tser {
    @Test
    public void a1(){
        master a=new master();
        a.setId(2);
        a.setName("老a");
        a.setAge("22");
        a.setPassword("852246");
        a.setRmb("55664");
        boolean ms= mybatisutil.getSqlSession().getMapper(masterjk.class).insertcz(a);
        mybatisutil.getSqlSession().commit();
        mybatisutil.close();
        System.out.println("是否成功"+ms);
    }
    @Test
    public void a2(){
        List<master> as=mybatisutil.getSqlSession().getMapper(masterjk.class).selectcz();
        mybatisutil.getSqlSession().commit();
        mybatisutil.close();
        System.out.println(as);
    }
    @Test
    public void a3(){
        master as=new master();
        as.setId(1);
        boolean a=mybatisutil.getSqlSession().getMapper(masterjk.class).deletecz(as);
        mybatisutil.getSqlSession().commit();
        mybatisutil.close();
        System.out.println("是否成功"+a);
    }
    @Test
    public void a4(){
        master a=new master();
        a.setId(1);
        a.setName("老b");
        a.setAge("23");
        a.setPassword("852246");
        a.setRmb("55664");
        boolean as=mybatisutil.getSqlSession().getMapper(masterjk.class).updatecz(a);
        mybatisutil.getSqlSession().commit();
        mybatisutil.close();
        System.out.println("是否成功"+as);
    }
}
