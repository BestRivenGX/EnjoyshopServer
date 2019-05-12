package com.example.demo5.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HomecampaignDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Homecampaign homecampaign = new Homecampaign();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = homecampaign.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> title = homecampaign.title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cpone = homecampaign.cpone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cptwo = homecampaign.cptwo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cpthree = homecampaign.cpthree;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Homecampaign extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<String> cpone = column("cpOne", JDBCType.VARCHAR);

        public final SqlColumn<String> cptwo = column("cpTwo", JDBCType.VARCHAR);

        public final SqlColumn<String> cpthree = column("cpThree", JDBCType.VARCHAR);

        public Homecampaign() {
            super("homecampaign");
        }
    }
}