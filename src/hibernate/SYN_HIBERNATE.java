package hibernate;

import java.util.List;
import org.hibernate.Session;

public class SYN_HIBERNATE {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ComputerDescription computerDescription = new ComputerDescription();
        computerDescription.setSeries("NeoGame");
        computerDescription.setDrive("HDD, SSD");
        session.save(computerDescription);
        computerDescription = (ComputerDescription) session.get(ComputerDescription.class, computerDescription.getId());
        computerDescription.setDrive("HDD");
        session.save(computerDescription);
        session.flush();
        session.delete(computerDescription);
        session.flush();
        List<ComputerDescription> list = (List<ComputerDescription>) session.createCriteria(ComputerDescription.class).list();
//	    List<UserRole> list=(List<UserRole>)session.createSQLQuery("select * from UserRole").addEntity(UserRole.class).list();
//        List<UserRole> list = (List<UserRole>) session.createQuery("from UserRole where id in (7,10,48)").list();
        list.forEach((role) -> {
            System.out.println(role);
        });

        Computer comp = new Computer();      
        
        comp.setProducer("PBA");
        comp.setProcessor("Intel");
        comp.setCores(8);
        comp.setComputerDescription(new ComputerDescription("Neo", "Intel"));
        session.save(comp);
        comp = (Computer) session.get(Computer.class, comp.getId());
        
        session.save(comp);
        session.flush();
        //   session.delete(user);
        //  session.flush();
        List<Computer> list2 = (List<Computer>) session
                .createCriteria(Computer.class)
                //  .addOrder(Order.asc("login"))
                // .createCriteria("userRole")
                //.add(Expression.like("name", "%"))
                //.addOrder(Order.asc("name"))
                .list();
        list2.forEach((item) -> {
            System.out.println(item);
        });
        session.close();

        System.exit(0);
    }
}
