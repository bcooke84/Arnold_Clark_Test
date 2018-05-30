system "clear"

puts "Enter your age in Earth Years: "
earth_age = gets.chomp.to_i

system "clear"

earth_age_in_seconds = (earth_age * 365.25 * 24 * 60 * 60)
mercury_age = earth_age / 0.2408467
venus_age = earth_age / 0.61519726
mars_age = earth_age / 1.8808158
jupiter_age = earth_age / 11.862615
saturn_age = earth_age / 29.447498
uranus_age = earth_age / 84.016846
neptune_age = earth_age / 164.79132
pluto_age = earth_age / 248.00

puts "Your age on Earth is #{earth_age}."
puts "That is #{earth_age_in_seconds} seconds!"
puts mercury_age > 1 ? "Your age on Mercury is #{mercury_age.floor}." : "You are less than 1 year old on Mercury!"
puts venus_age > 1 ? "Your age on Venus is #{venus_age.floor}." : "You are less than 1 year old on Venus!"
puts mars_age > 1 ? "Your age on Mars is #{mars_age.floor}." : "You are less than 1 year old on Mars!"
puts jupiter_age > 1 ? "Your age on Jupiter is #{jupiter_age.floor}." : "You are less than 1 year old on Jupiter!"
puts saturn_age > 1 ? "Your age on Saturn is #{saturn_age.floor}." : "You are less than 1 year old on Saturn!"
puts uranus_age > 1 ? "Your age on Uranus is #{uranus_age.floor}." : "You are less than 1 year old on Uranus!"
puts neptune_age > 1 ? "Your age on Neptune is #{neptune_age.floor}." : "You are less than 1 year old on Neptune!"
puts pluto_age > 1 ? "Your age on Pluto is #{pluto_age.floor}." : "You are less than 1 year old on Pluto!"
