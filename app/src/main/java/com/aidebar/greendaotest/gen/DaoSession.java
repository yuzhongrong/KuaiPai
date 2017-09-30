package com.aidebar.greendaotest.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.koolmeo.bean.DBBeanUpLoadVideoInfo;
import com.example.koolmeo.bean.HttpBeanMediaDetail;
import com.example.koolmeo.bean.LocalMediaDetailBean;

import com.aidebar.greendaotest.gen.DBBeanUpLoadVideoInfoDao;
import com.aidebar.greendaotest.gen.HttpBeanMediaDetailDao;
import com.aidebar.greendaotest.gen.LocalMediaDetailBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dBBeanUpLoadVideoInfoDaoConfig;
    private final DaoConfig httpBeanMediaDetailDaoConfig;
    private final DaoConfig localMediaDetailBeanDaoConfig;

    private final DBBeanUpLoadVideoInfoDao dBBeanUpLoadVideoInfoDao;
    private final HttpBeanMediaDetailDao httpBeanMediaDetailDao;
    private final LocalMediaDetailBeanDao localMediaDetailBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dBBeanUpLoadVideoInfoDaoConfig = daoConfigMap.get(DBBeanUpLoadVideoInfoDao.class).clone();
        dBBeanUpLoadVideoInfoDaoConfig.initIdentityScope(type);

        httpBeanMediaDetailDaoConfig = daoConfigMap.get(HttpBeanMediaDetailDao.class).clone();
        httpBeanMediaDetailDaoConfig.initIdentityScope(type);

        localMediaDetailBeanDaoConfig = daoConfigMap.get(LocalMediaDetailBeanDao.class).clone();
        localMediaDetailBeanDaoConfig.initIdentityScope(type);

        dBBeanUpLoadVideoInfoDao = new DBBeanUpLoadVideoInfoDao(dBBeanUpLoadVideoInfoDaoConfig, this);
        httpBeanMediaDetailDao = new HttpBeanMediaDetailDao(httpBeanMediaDetailDaoConfig, this);
        localMediaDetailBeanDao = new LocalMediaDetailBeanDao(localMediaDetailBeanDaoConfig, this);

        registerDao(DBBeanUpLoadVideoInfo.class, dBBeanUpLoadVideoInfoDao);
        registerDao(HttpBeanMediaDetail.class, httpBeanMediaDetailDao);
        registerDao(LocalMediaDetailBean.class, localMediaDetailBeanDao);
    }
    
    public void clear() {
        dBBeanUpLoadVideoInfoDaoConfig.clearIdentityScope();
        httpBeanMediaDetailDaoConfig.clearIdentityScope();
        localMediaDetailBeanDaoConfig.clearIdentityScope();
    }

    public DBBeanUpLoadVideoInfoDao getDBBeanUpLoadVideoInfoDao() {
        return dBBeanUpLoadVideoInfoDao;
    }

    public HttpBeanMediaDetailDao getHttpBeanMediaDetailDao() {
        return httpBeanMediaDetailDao;
    }

    public LocalMediaDetailBeanDao getLocalMediaDetailBeanDao() {
        return localMediaDetailBeanDao;
    }

}
