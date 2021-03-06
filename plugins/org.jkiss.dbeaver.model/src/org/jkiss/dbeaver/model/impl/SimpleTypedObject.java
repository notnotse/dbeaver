/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.impl;

import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * SimpleTypedObject
 */
public class SimpleTypedObject implements DBSTypedObject {

    public static final SimpleTypedObject DEFAULT_TYPE = new SimpleTypedObject("Object");

    private String typeName;

    public SimpleTypedObject(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String getTypeName() {
        return typeName;
    }

    @Override
    public String getFullTypeName() {
        return getTypeName();
    }

    @Override
    public int getTypeID() {
        return 0;
    }

    @Override
    public DBPDataKind getDataKind() {
        return DBPDataKind.OBJECT;
    }

    @Override
    public Integer getScale() {
        return null;
    }

    @Override
    public Integer getPrecision() {
        return null;
    }

    @Override
    public long getMaxLength() {
        return 0;
    }
}