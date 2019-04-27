package com.finalproject.automated.refactoring.tool.locs.detection.service;

import lombok.NonNull;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 27 April 2019
 */

public interface LocsDetection {

    Long llocDetection(@NonNull String body);
}
