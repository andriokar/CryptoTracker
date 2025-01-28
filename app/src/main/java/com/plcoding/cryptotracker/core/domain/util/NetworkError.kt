package com.plcoding.cryptotracker.core.domain.util

enum class NetworkError : Error {
    REQUEST_TIMEOUT_ERROR,
    TOO_MANY_REQUESTS_ERROR,
    NO_INTERNET_CONNECTION_ERROR,
    SERVER_ERROR,
    SERIALIZATION_ERROR,
    UNKNOWN_ERROR
}
