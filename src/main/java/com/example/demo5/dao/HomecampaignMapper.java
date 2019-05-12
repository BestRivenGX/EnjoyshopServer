package com.example.demo5.dao;

import static com.example.demo5.dao.HomecampaignDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.demo5.model.Homecampaign;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface HomecampaignMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<Homecampaign> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HomecampaignResult")
    Homecampaign selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HomecampaignResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpOne", property="cpone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpTwo", property="cptwo", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpThree", property="cpthree", jdbcType=JdbcType.VARCHAR)
    })
    List<Homecampaign> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(homecampaign);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, homecampaign);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, homecampaign)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Homecampaign record) {
        return insert(SqlBuilder.insert(record)
                .into(homecampaign)
                .map(title).toProperty("title")
                .map(cpone).toProperty("cpone")
                .map(cptwo).toProperty("cptwo")
                .map(cpthree).toProperty("cpthree")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Homecampaign record) {
        return insert(SqlBuilder.insert(record)
                .into(homecampaign)
                .map(title).toPropertyWhenPresent("title", record::getTitle)
                .map(cpone).toPropertyWhenPresent("cpone", record::getCpone)
                .map(cptwo).toPropertyWhenPresent("cptwo", record::getCptwo)
                .map(cpthree).toPropertyWhenPresent("cpthree", record::getCpthree)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Homecampaign>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, title, cpone, cptwo, cpthree)
                .from(homecampaign);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Homecampaign>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, title, cpone, cptwo, cpthree)
                .from(homecampaign);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Homecampaign selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, title, cpone, cptwo, cpthree)
                .from(homecampaign)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Homecampaign record) {
        return UpdateDSL.updateWithMapper(this::update, homecampaign)
                .set(title).equalTo(record::getTitle)
                .set(cpone).equalTo(record::getCpone)
                .set(cptwo).equalTo(record::getCptwo)
                .set(cpthree).equalTo(record::getCpthree);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Homecampaign record) {
        return UpdateDSL.updateWithMapper(this::update, homecampaign)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(cpone).equalToWhenPresent(record::getCpone)
                .set(cptwo).equalToWhenPresent(record::getCptwo)
                .set(cpthree).equalToWhenPresent(record::getCpthree);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Homecampaign record) {
        return UpdateDSL.updateWithMapper(this::update, homecampaign)
                .set(title).equalTo(record::getTitle)
                .set(cpone).equalTo(record::getCpone)
                .set(cptwo).equalTo(record::getCptwo)
                .set(cpthree).equalTo(record::getCpthree)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Homecampaign record) {
        return UpdateDSL.updateWithMapper(this::update, homecampaign)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(cpone).equalToWhenPresent(record::getCpone)
                .set(cptwo).equalToWhenPresent(record::getCptwo)
                .set(cpthree).equalToWhenPresent(record::getCpthree)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}