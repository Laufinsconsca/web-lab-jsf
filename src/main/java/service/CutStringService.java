package service;

import jakarta.ejb.Remote;

@Remote
public interface CutStringService {
    String performCutString(String inputString, Integer cutLength);
}
