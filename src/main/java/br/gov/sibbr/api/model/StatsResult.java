/**
  	SiBBr API - Interface pública de acesso aos registros de ocorrência
    Copyright (C) 2015  SiBBr - Sistema de Informação sobre a Biodiversidade Brasileira

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
 */

package br.gov.sibbr.api.model;

/**
 * This class should model an api result to be mapped into a json object,
 * including arbitrary headers. This result represents the current status of the database.
 * 
 * @author Pedro Guimarães
 *
 */

public class StatsResult {
	
	private Integer amount;
	
	// The amount of time that took the query in milliseconds
	private Long queryLength;
	
	/**
	 * Default class constructor
	 */
	public StatsResult(Integer amount, Long queryLength) {
		this.amount = amount;
		this.queryLength = queryLength;
	}
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Long getQueryLength() {
		return queryLength;
	}

	public void setQueryLength(Long queryLength) {
		this.queryLength = queryLength;
	}
}
