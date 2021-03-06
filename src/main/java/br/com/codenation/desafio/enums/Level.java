package br.com.codenation.desafio.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum Level {

	ERROR("Erro"),
	WARNING("Warning"),
	DEBUG("Debug");
	
	private String description;
	
	Level(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
