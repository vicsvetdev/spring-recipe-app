package com.vicsvetdev.springrecipeapp.services;

import com.vicsvetdev.springrecipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
