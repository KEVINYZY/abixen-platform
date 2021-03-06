/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.service.businessintelligence.multivisualisation.model.impl.data;

import com.abixen.platform.service.businessintelligence.multivisualisation.model.web.DataValueDateWeb;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "data_value_date")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class DataValueDate extends DataValue<Date> implements DataValueDateWeb {

    private static final long serialVersionUID = -655187403228089633L;

    @Column(name = "value", nullable = true)
    private Date value;

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }


}