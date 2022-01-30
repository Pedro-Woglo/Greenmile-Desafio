package br.com.greenmile.rotas.controller.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.greenmile.rotas.enums.StatusRota;
import br.com.greenmile.rotas.model.Rota;
import br.com.greenmile.rotas.model.Stop;

public class RotaDto {

	private Long id;
	private LocalDate date = LocalDate.now();
	private StatusRota status;
	private List<Stop> stops = new ArrayList<>();
	
	public RotaDto(Rota rota) {
		this.id = rota.getId();
		this.date = rota.getDate();
		this.status = rota.getStatus();
	//	this.stops = rota.getStops();
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public StatusRota getStatus() {
		return status;
	}

	public List<Stop> getStops() {
		return stops;
	}

	public static List<RotaDto> converter(List<Rota> rotas) {
		return rotas.stream().map(RotaDto::new).collect(Collectors.toList());
	}

}
