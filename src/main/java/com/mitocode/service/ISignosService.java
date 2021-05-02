package com.mitocode.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mitocode.model.Signos;

public interface ISignosService extends ICRUD<Signos , Integer>{
	
	Page<Signos> ListarPageable(Pageable pageable);

}
