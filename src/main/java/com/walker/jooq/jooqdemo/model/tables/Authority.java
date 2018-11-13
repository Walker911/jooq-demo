/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables;


import com.walker.jooq.jooqdemo.model.Exchange;
import com.walker.jooq.jooqdemo.model.Indexes;
import com.walker.jooq.jooqdemo.model.Keys;
import com.walker.jooq.jooqdemo.model.tables.records.AuthorityRecord;

import java.sql.Timestamp;
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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Authority extends TableImpl<AuthorityRecord> {

    private static final long serialVersionUID = -2107516962;

    /**
     * The reference instance of <code>exchange.authority</code>
     */
    public static final Authority AUTHORITY = new Authority();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorityRecord> getRecordType() {
        return AuthorityRecord.class;
    }

    /**
     * The column <code>exchange.authority.id</code>.
     */
    public final TableField<AuthorityRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>exchange.authority.name</code>. 权限名称
     */
    public final TableField<AuthorityRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "权限名称");

    /**
     * The column <code>exchange.authority.create_time</code>. 创建时间
     */
    public final TableField<AuthorityRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>exchange.authority.update_time</code>. 修改时间
     */
    public final TableField<AuthorityRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "修改时间");

    /**
     * The column <code>exchange.authority.url</code>. 前端路由地址
     */
    public final TableField<AuthorityRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255), this, "前端路由地址");

    /**
     * The column <code>exchange.authority.sortId</code>. 排序字段
     */
    public final TableField<AuthorityRecord, Integer> SORTID = createField("sortId", org.jooq.impl.SQLDataType.INTEGER, this, "排序字段");

    /**
     * Create a <code>exchange.authority</code> table reference
     */
    public Authority() {
        this(DSL.name("authority"), null);
    }

    /**
     * Create an aliased <code>exchange.authority</code> table reference
     */
    public Authority(String alias) {
        this(DSL.name(alias), AUTHORITY);
    }

    /**
     * Create an aliased <code>exchange.authority</code> table reference
     */
    public Authority(Name alias) {
        this(alias, AUTHORITY);
    }

    private Authority(Name alias, Table<AuthorityRecord> aliased) {
        this(alias, aliased, null);
    }

    private Authority(Name alias, Table<AuthorityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Authority(Table<O> child, ForeignKey<O, AuthorityRecord> key) {
        super(child, key, AUTHORITY);
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
        return Arrays.<Index>asList(Indexes.AUTHORITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorityRecord> getPrimaryKey() {
        return Keys.KEY_AUTHORITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorityRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorityRecord>>asList(Keys.KEY_AUTHORITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Authority as(String alias) {
        return new Authority(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Authority as(Name alias) {
        return new Authority(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Authority rename(String name) {
        return new Authority(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Authority rename(Name name) {
        return new Authority(name, null);
    }
}
