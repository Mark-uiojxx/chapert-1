package org.mylearn.chapter1.model;

/**
 * 文件名称:customer.java
 * 包名:com.test.beans.customer.dbmodel;
 * 创建时间:2017-06-26 21:47:02
 */


import java.io.Serializable;

/**
 * 类名: customer
 * 作用说明:
 * 创建时间: 2017-06-26 21:47:02
 *
 * @author admin
 * @since JDK 1.8
 */
public class Customer implements Serializable {

    /**
     * 序列化对象
     */
    private static final long serialVersionUID = 1L;
    /**
     * 表名
     */
    public static final String TABLE_NAME = "customer";
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    public static final String ID_ATTR = "id";
    /**
     *
     */
    public static final String ID = "id";
    /**
     *
     */
    private String name;
    /**
     *
     */
    public static final String NAME_ATTR = "name";
    /**
     *
     */
    public static final String NAME = "name";
    /**
     *
     */
    private String contact;
    /**
     *
     */
    public static final String CONTACT_ATTR = "contact";
    /**
     *
     */
    public static final String CONTACT = "contact";
    /**
     *
     */
    private String telephone;
    /**
     *
     */
    public static final String TELEPHONE_ATTR = "telephone";
    /**
     *
     */
    public static final String TELEPHONE = "telephone";
    /**
     *
     */
    private String email;
    /**
     *
     */
    public static final String EMAIL_ATTR = "email";
    /**
     *
     */
    public static final String EMAIL = "email";
    /**
     *
     */
    private String remark;
    /**
     *
     */
    public static final String REMARK_ATTR = "remark";
    /**
     *
     */
    public static final String REMARK = "remark";

    /**
     *
     * 方法作用说明:get方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @return
     * @since JDK 1.8
     */
    public Integer getId() {
        return this.id;
    }

    /**
     *
     * 方法作用说明:set方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @param id
     * @since JDK 1.8
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * 方法作用说明:get方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @return
     * @since JDK 1.8
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * 方法作用说明:set方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @param name
     * @since JDK 1.8
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * 方法作用说明:get方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @return
     * @since JDK 1.8
     */
    public String getContact() {
        return this.contact;
    }

    /**
     *
     * 方法作用说明:set方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @param contact
     * @since JDK 1.8
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     *
     * 方法作用说明:get方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @return
     * @since JDK 1.8
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     *
     * 方法作用说明:set方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @param telephone
     * @since JDK 1.8
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     *
     * 方法作用说明:get方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @return
     * @since JDK 1.8
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *
     * 方法作用说明:set方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @param email
     * @since JDK 1.8
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * 方法作用说明:get方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @return
     * @since JDK 1.8
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     *
     * 方法作用说明:set方法
     * 使用说明:
     * 使用注意事项:
     *
     * @author admin
     * @param remark
     * @since JDK 1.8
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

}

