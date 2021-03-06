package br.com.codenation.desafio.dtos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import br.com.codenation.desafio.model.Log;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private UUID id;

    private String nome;

    private String email;
		
    private String password;

    private String token;

    private List<Log> logs;
	
	private LocalDateTime createdAt;
}
