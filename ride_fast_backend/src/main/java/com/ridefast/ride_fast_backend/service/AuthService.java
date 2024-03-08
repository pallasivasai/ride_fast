package com.ridefast.ride_fast_backend.service;

import com.ridefast.ride_fast_backend.dto.JwtResponse;
import com.ridefast.ride_fast_backend.dto.LoginRequest;
import com.ridefast.ride_fast_backend.dto.SignUpRequest;
import com.ridefast.ride_fast_backend.dto.UserResponse;
import com.ridefast.ride_fast_backend.exception.ResourceNotFoundException;

public interface AuthService {
  UserResponse signUpUser(SignUpRequest request);

  JwtResponse loginUser(LoginRequest request) throws ResourceNotFoundException;
}