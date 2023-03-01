package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.DeleteUser;
import com.educandoweb.course.core.usecase.DeleteUserUseCase;
import com.educandoweb.course.dataprovider.exceptions.DatabaseException;
import com.educandoweb.course.dataprovider.exceptions.ResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.UUID;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final DeleteUser deleteUser;

    public DeleteUserUseCaseImpl(DeleteUser deleteUser) {
        this.deleteUser = deleteUser;
    }

    @Override
    public void delete(UUID id) {
        try {
            deleteUser.delete(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }

    }
}
