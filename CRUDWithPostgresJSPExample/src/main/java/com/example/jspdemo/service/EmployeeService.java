package com.example.jspdemo.service;

import com.example.jspdemo.model.Employee;
import com.example.jspdemo.repo.IAnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IAnimeRepository animeRepo;

    public List<Employee> getAllEmployee() {
        List<Employee> animeList = new ArrayList<>();
        animeRepo.findAll().forEach(anime -> animeList.add(anime));

        return animeList;
    }

    public Employee getAnimeById(Long id) {
        return animeRepo.findById(id).get();
    }

    public boolean saveOrUpdateAnime(Employee anime) {
    	Employee updatedAnime = animeRepo.save(anime);

        if (animeRepo.findById(updatedAnime.getId()) != null) {
            return true;
        }

        return false;
    }

    public boolean deleteAnime(Long id) {
        animeRepo.deleteById(id);

        if (animeRepo.findById(id) != null) {
            return true;
        }

        return false;
    }

}
