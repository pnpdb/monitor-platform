package com.ducetech.app.model.vo;

import com.ducetech.app.model.Fault;
import lombok.Data;

import java.util.List;


@Data
public class FaultVo extends Fault {
    private List<Fault> faults;
}
