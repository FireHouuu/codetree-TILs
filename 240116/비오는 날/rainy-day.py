n = int(input())

class forecast:
    def __init__(self, date, yoil, weather):
        self.date = date
        self.yoil = yoil
        self.weather = weather

_list = [forecast(*input().split()) for _ in range(n)]

idx = 0

for i, forecast in enumerate(_list):
    if _list[idx].weather != "Rain":
        if forecast.weather == "Rain":
            idx = i
    elif forecast.weather == "Rain" and forecast.date < _list[idx].date:
        idx = i

print(_list[idx].date, _list[idx].yoil, _list[idx].weather)