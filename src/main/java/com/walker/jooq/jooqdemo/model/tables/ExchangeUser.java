/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables;


import com.walker.jooq.jooqdemo.model.Exchange;
import com.walker.jooq.jooqdemo.model.Indexes;
import com.walker.jooq.jooqdemo.model.Keys;
import com.walker.jooq.jooqdemo.model.tables.records.ExchangeUserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 兑换人兑换信息关联表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExchangeUser extends TableImpl<ExchangeUserRecord> {

    private static final long serialVersionUID = -560116482;

    /**
     * The reference instance of <code>exchange.exchange_user</code>
     */
    public static final ExchangeUser EXCHANGE_USER = new ExchangeUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExchangeUserRecord> getRecordType() {
        return ExchangeUserRecord.class;
    }

    /**
     * The column <code>exchange.exchange_user.id</code>. 主键UUID
     */
    public final TableField<ExchangeUserRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "主键UUID");

    /**
     * The column <code>exchange.exchange_user.user_id</code>. 领卡人id
     */
    public final TableField<ExchangeUserRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "领卡人id");

    /**
     * The column <code>exchange.exchange_user.exchange_id</code>. 兑换id：油卡或红包
     */
    public final TableField<ExchangeUserRecord, String> EXCHANGE_ID = createField("exchange_id", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "兑换id：油卡或红包");

    /**
     * The column <code>exchange.exchange_user.exchange_type</code>. 兑换类型：0-油卡，1-红包
     */
    public final TableField<ExchangeUserRecord, Byte> EXCHANGE_TYPE = createField("exchange_type", org.jooq.impl.SQLDataType.TINYINT, this, "兑换类型：0-油卡，1-红包");

    /**
     * Create a <code>exchange.exchange_user</code> table reference
     */
    public ExchangeUser() {
        this(DSL.name("exchange_user"), null);
    }

    /**
     * Create an aliased <code>exchange.exchange_user</code> table reference
     */
    public ExchangeUser(String alias) {
        this(DSL.name(alias), EXCHANGE_USER);
    }

    /**
     * Create an aliased <code>exchange.exchange_user</code> table reference
     */
    public ExchangeUser(Name alias) {
        this(alias, EXCHANGE_USER);
    }

    private ExchangeUser(Name alias, Table<ExchangeUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExchangeUser(Name alias, Table<ExchangeUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("兑换人兑换信息关联表"));
    }

    public <O extends Record> ExchangeUser(Table<O> child, ForeignKey<O, ExchangeUserRecord> key) {
        super(child, key, EXCHANGE_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Exchange.EXCHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EXCHANGE_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExchangeUserRecord> getPrimaryKey() {
        return Keys.KEY_EXCHANGE_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExchangeUserRecord>> getKeys() {
        return Arrays.<UniqueKey<ExchangeUserRecord>>asList(Keys.KEY_EXCHANGE_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeUser as(String alias) {
        return new ExchangeUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeUser as(Name alias) {
        return new ExchangeUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExchangeUser rename(String name) {
        return new ExchangeUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExchangeUser rename(Name name) {
        return new ExchangeUser(name, null);
    }
}
