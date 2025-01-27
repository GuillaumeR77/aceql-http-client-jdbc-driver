/*
 * This file is part of AceQL JDBC Driver.
 * AceQL JDBC Driver: Remote JDBC access over HTTP with AceQL HTTP.
 * Copyright (C) 2021,  KawanSoft SAS
 * (http://www.kawansoft.com). All rights reserved.
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
package com.aceql.jdbc.commons.main;

import java.sql.SQLException;
import java.sql.Savepoint;

/**
 * A Dummy Savepoint to make sure JDBC Driver don't fail.
 * @author Nicolas de Pomereu
 *
 */
public class AceQLSavepoint implements Savepoint {



    /*
     * (non-Javadoc)
     * @see java.sql.Savepoint#getSavepointId()
     */
    @Override
    public int getSavepointId() throws SQLException {
	return 1;
    }

    /*
     * (non-Javadoc)
     * @see java.sql.Savepoint#getSavepointName()
     */
    @Override
    public String getSavepointName() throws SQLException {
	return "AceQLDummySavepoint";
    }


}
