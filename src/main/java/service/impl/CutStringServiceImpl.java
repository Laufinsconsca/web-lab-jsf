package service.impl;

import jakarta.ejb.Stateless;
import service.CutStringService;

@Stateless
public class CutStringServiceImpl implements CutStringService {
    @Override
    public String performCutString(String inputString, Integer cutLength) {
        return inputString.substring(cutLength);
    }
}
