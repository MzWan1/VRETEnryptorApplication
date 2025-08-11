package za.ac.tut.ejb.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-08-11T19:54:57")
@StaticMetamodel(Messages.class)
public class Messages_ { 

    public static volatile SingularAttribute<Messages, String> agentid;
    public static volatile SingularAttribute<Messages, Integer> messagelen;
    public static volatile SingularAttribute<Messages, Integer> messageid;
    public static volatile SingularAttribute<Messages, Date> datecreated;
    public static volatile SingularAttribute<Messages, String> message;

}